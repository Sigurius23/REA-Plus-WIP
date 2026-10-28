package com.whoop.sleep.coach.data.network.model;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/Vow;", "", "header", "", "key", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeader", "()Ljava/lang/String;", "getKey", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class Vow {
    public static final int $stable = 0;
    private final String header;
    private final String key;
    private final String text;

    public Vow(String str, String key, String text) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(text, "text");
        this.header = str;
        this.key = key;
        this.text = text;
    }

    public static /* synthetic */ Vow copy$default(Vow vow, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = vow.header;
        }
        if ((i13 & 2) != 0) {
            str2 = vow.key;
        }
        if ((i13 & 4) != 0) {
            str3 = vow.text;
        }
        return vow.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Vow copy(String header, String key, String text) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(text, "text");
        return new Vow(header, key, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vow)) {
            return false;
        }
        Vow vow = (Vow) other;
        return AbstractC22676k.m65745e(this.header, vow.header) && AbstractC22676k.m65745e(this.key, vow.key) && AbstractC22676k.m65745e(this.text, vow.text);
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.header;
        return this.text.hashCode() + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.key);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.text, ")", AbstractC11895b.m32001t("Vow(header=", this.header, ", key=", this.key, ", text="));
    }
}
