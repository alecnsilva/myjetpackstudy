package br.com.jetpack.data.local.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import br.com.jetpack.data.local.database.dao.ProductDao;
import br.com.jetpack.data.local.database.dao.ProductDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DataBase_Impl extends DataBase {
  private volatile ProductDao _productDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `product` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `subTitle` TEXT NOT NULL, `description` TEXT NOT NULL, `availableUnits` INTEGER NOT NULL, `price` TEXT NOT NULL, `promoPrice` TEXT NOT NULL, `img` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `savedProduct` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `subTitle` TEXT NOT NULL, `description` TEXT NOT NULL, `unitsSaved` INTEGER NOT NULL, `price` TEXT NOT NULL, `img` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '85dbd540f23a1c7cbf630c15582ac0ef')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `product`");
        _db.execSQL("DROP TABLE IF EXISTS `savedProduct`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProduct = new HashMap<String, TableInfo.Column>(8);
        _columnsProduct.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("subTitle", new TableInfo.Column("subTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("availableUnits", new TableInfo.Column("availableUnits", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("price", new TableInfo.Column("price", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("promoPrice", new TableInfo.Column("promoPrice", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("img", new TableInfo.Column("img", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProduct = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProduct = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProduct = new TableInfo("product", _columnsProduct, _foreignKeysProduct, _indicesProduct);
        final TableInfo _existingProduct = TableInfo.read(_db, "product");
        if (! _infoProduct.equals(_existingProduct)) {
          return new RoomOpenHelper.ValidationResult(false, "product(br.com.jetpack.data.local.database.entity.ProductEntity).\n"
                  + " Expected:\n" + _infoProduct + "\n"
                  + " Found:\n" + _existingProduct);
        }
        final HashMap<String, TableInfo.Column> _columnsSavedProduct = new HashMap<String, TableInfo.Column>(7);
        _columnsSavedProduct.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavedProduct.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavedProduct.put("subTitle", new TableInfo.Column("subTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavedProduct.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavedProduct.put("unitsSaved", new TableInfo.Column("unitsSaved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavedProduct.put("price", new TableInfo.Column("price", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavedProduct.put("img", new TableInfo.Column("img", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSavedProduct = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSavedProduct = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSavedProduct = new TableInfo("savedProduct", _columnsSavedProduct, _foreignKeysSavedProduct, _indicesSavedProduct);
        final TableInfo _existingSavedProduct = TableInfo.read(_db, "savedProduct");
        if (! _infoSavedProduct.equals(_existingSavedProduct)) {
          return new RoomOpenHelper.ValidationResult(false, "savedProduct(br.com.jetpack.data.local.database.entity.SavedProductEntity).\n"
                  + " Expected:\n" + _infoSavedProduct + "\n"
                  + " Found:\n" + _existingSavedProduct);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "85dbd540f23a1c7cbf630c15582ac0ef", "e4c325a5b4a5d5bfdbcf2438dd7d7b50");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "product","savedProduct");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `product`");
      _db.execSQL("DELETE FROM `savedProduct`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ProductDao productDao() {
    if (_productDao != null) {
      return _productDao;
    } else {
      synchronized(this) {
        if(_productDao == null) {
          _productDao = new ProductDao_Impl(this);
        }
        return _productDao;
      }
    }
  }
}
