package br.com.myjetpack.data.local.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import br.com.myjetpack.data.local.database.entity.ProductEntity;
import br.com.myjetpack.data.local.database.entity.SavedProductEntity;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SavedProductEntity> __insertionAdapterOfSavedProductEntity;

  private final EntityInsertionAdapter<ProductEntity> __insertionAdapterOfProductEntity;

  public ProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSavedProductEntity = new EntityInsertionAdapter<SavedProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `savedProduct` (`id`,`title`,`subTitle`,`description`,`unitsSaved`,`price`,`img`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SavedProductEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getSubTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSubTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getUnitsSaved());
        if (value.getPrice() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPrice());
        }
        stmt.bindLong(7, value.getImg());
      }
    };
    this.__insertionAdapterOfProductEntity = new EntityInsertionAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `product` (`id`,`title`,`subTitle`,`description`,`availableUnits`,`price`,`promoPrice`,`img`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getSubTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSubTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getAvailableUnits());
        if (value.getPrice() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPrice());
        }
        if (value.getPromoPrice() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPromoPrice());
        }
        stmt.bindLong(8, value.getImg());
      }
    };
  }

  @Override
  public Object insertSavedProduct(final SavedProductEntity product,
      final Continuation<? super Unit> continuation) {
    __db.assertNotSuspendingTransaction();
  }

  @Override
  public Object insertProduct(final ProductEntity product,
      final Continuation<? super Unit> continuation) {
    __db.assertNotSuspendingTransaction();
  }

  @Override
  public Object insertMock(final List<ProductEntity> product,
      final Continuation<? super Unit> continuation) {
    __db.assertNotSuspendingTransaction();
  }

  @Override
  public Object getAllSaved(final Continuation<? super List<SavedProductEntity>> continuation) {
    final String _sql = "SELECT * FROM savedProduct";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    int _argIndex = 1;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final Object _result;
      if(_cursor.moveToFirst()) {
        _result = new Object();
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object getAllProducts(final Continuation<? super List<ProductEntity>> continuation) {
    final String _sql = "SELECT * FROM product";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    int _argIndex = 1;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final Object _result;
      if(_cursor.moveToFirst()) {
        _result = new Object();
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object removeProduct(final String id, final Continuation<? super Unit> continuation) {
    __db.assertNotSuspendingTransaction();
  }

  @Override
  public Object removeSavedProduct(final String id, final Continuation<? super Unit> continuation) {
    __db.assertNotSuspendingTransaction();
  }
}
