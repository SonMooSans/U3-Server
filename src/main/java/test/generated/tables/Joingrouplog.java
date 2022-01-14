/*
 * This file is generated by jOOQ.
 */
package test.generated.tables;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import test.generated.Keys;
import test.generated.Login;
import test.generated.tables.records.JoingrouplogRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Joingrouplog extends TableImpl<JoingrouplogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>login.joingrouplog</code>
     */
    public static final Joingrouplog JOINGROUPLOG = new Joingrouplog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JoingrouplogRecord> getRecordType() {
        return JoingrouplogRecord.class;
    }

    /**
     * The column <code>login.joingrouplog.GroupID</code>.
     */
    public final TableField<JoingrouplogRecord, Integer> GROUPID = createField(DSL.name("GroupID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>login.joingrouplog.USERID</code>.
     */
    public final TableField<JoingrouplogRecord, Integer> USERID = createField(DSL.name("USERID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>login.joingrouplog.lastCheckTime</code>.
     */
    public final TableField<JoingrouplogRecord, LocalDateTime> LASTCHECKTIME = createField(DSL.name("lastCheckTime"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>login.joingrouplog.isGroupPrivate</code>.
     */
    public final TableField<JoingrouplogRecord, Byte> ISGROUPPRIVATE = createField(DSL.name("isGroupPrivate"), SQLDataType.TINYINT.defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    private Joingrouplog(Name alias, Table<JoingrouplogRecord> aliased) {
        this(alias, aliased, null);
    }

    private Joingrouplog(Name alias, Table<JoingrouplogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>login.joingrouplog</code> table reference
     */
    public Joingrouplog(String alias) {
        this(DSL.name(alias), JOINGROUPLOG);
    }

    /**
     * Create an aliased <code>login.joingrouplog</code> table reference
     */
    public Joingrouplog(Name alias) {
        this(alias, JOINGROUPLOG);
    }

    /**
     * Create a <code>login.joingrouplog</code> table reference
     */
    public Joingrouplog() {
        this(DSL.name("joingrouplog"), null);
    }

    public <O extends Record> Joingrouplog(Table<O> child, ForeignKey<O, JoingrouplogRecord> key) {
        super(child, key, JOINGROUPLOG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Login.LOGIN;
    }

    @Override
    public UniqueKey<JoingrouplogRecord> getPrimaryKey() {
        return Keys.KEY_JOINGROUPLOG_PRIMARY;
    }

    @Override
    public Joingrouplog as(String alias) {
        return new Joingrouplog(DSL.name(alias), this);
    }

    @Override
    public Joingrouplog as(Name alias) {
        return new Joingrouplog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Joingrouplog rename(String name) {
        return new Joingrouplog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Joingrouplog rename(Name name) {
        return new Joingrouplog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, LocalDateTime, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
