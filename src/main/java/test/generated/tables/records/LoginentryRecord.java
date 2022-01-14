/*
 * This file is generated by jOOQ.
 */
package test.generated.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import test.generated.tables.Loginentry;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoginentryRecord extends UpdatableRecordImpl<LoginentryRecord> implements Record4<String, String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>login.loginentry.email</code>.
     */
    public void setEmail(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>login.loginentry.email</code>.
     */
    public String getEmail() {
        return (String) get(0);
    }

    /**
     * Setter for <code>login.loginentry.password</code>.
     */
    public void setPassword(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>login.loginentry.password</code>.
     */
    public String getPassword() {
        return (String) get(1);
    }

    /**
     * Setter for <code>login.loginentry.token</code>.
     */
    public void setToken(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>login.loginentry.token</code>.
     */
    public String getToken() {
        return (String) get(2);
    }

    /**
     * Setter for <code>login.loginentry.userID</code>.
     */
    public void setUserid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>login.loginentry.userID</code>.
     */
    public Integer getUserid() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Loginentry.LOGINENTRY.EMAIL;
    }

    @Override
    public Field<String> field2() {
        return Loginentry.LOGINENTRY.PASSWORD;
    }

    @Override
    public Field<String> field3() {
        return Loginentry.LOGINENTRY.TOKEN;
    }

    @Override
    public Field<Integer> field4() {
        return Loginentry.LOGINENTRY.USERID;
    }

    @Override
    public String component1() {
        return getEmail();
    }

    @Override
    public String component2() {
        return getPassword();
    }

    @Override
    public String component3() {
        return getToken();
    }

    @Override
    public Integer component4() {
        return getUserid();
    }

    @Override
    public String value1() {
        return getEmail();
    }

    @Override
    public String value2() {
        return getPassword();
    }

    @Override
    public String value3() {
        return getToken();
    }

    @Override
    public Integer value4() {
        return getUserid();
    }

    @Override
    public LoginentryRecord value1(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public LoginentryRecord value2(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public LoginentryRecord value3(String value) {
        setToken(value);
        return this;
    }

    @Override
    public LoginentryRecord value4(Integer value) {
        setUserid(value);
        return this;
    }

    @Override
    public LoginentryRecord values(String value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LoginentryRecord
     */
    public LoginentryRecord() {
        super(Loginentry.LOGINENTRY);
    }

    /**
     * Create a detached, initialised LoginentryRecord
     */
    public LoginentryRecord(String email, String password, String token, Integer userid) {
        super(Loginentry.LOGINENTRY);

        setEmail(email);
        setPassword(password);
        setToken(token);
        setUserid(userid);
    }
}
