package com.whoop.data.local.room.entity.converter;

import com.whoop.p069ui.ScoreContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0016\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\f"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;", "", "<init>", "()V", "storedStringToEnum", "", "Lcom/whoop/ui/ScoreContext;", "value", "", "languagesToStoredString", "contextList", "getScoreContextEnum", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnableTabConverter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final ScoreContext getScoreContextEnum(String value) {
        switch (value.hashCode()) {
            case -1838664331:
                if (value.equals("STRAIN")) {
                    return ScoreContext.STRAIN;
                }
                break;
            case -16486507:
                if (value.equals("RECOVERY")) {
                    return ScoreContext.RECOVERY;
                }
                break;
            case 408556937:
                if (value.equals("PROFILE")) {
                    return ScoreContext.PROFILE;
                }
                break;
            case 1312742777:
                if (value.equals("OVERVIEW")) {
                    return ScoreContext.OVERVIEW;
                }
                break;
        }
        return ScoreContext.SLEEP;
    }

    public final String languagesToStoredString(List<? extends ScoreContext> contextList) {
        AbstractC22676k.m65750j(contextList, "contextList");
        return AbstractC25265s.m74110N0(contextList, null, null, null, null, 63);
    }

    public final List<ScoreContext> storedStringToEnum(String value) {
        AbstractC22676k.m65750j(value, "value");
        List listM125906y0 = AbstractC39414r.m125906y0(value, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM125906y0.iterator();
        while (it.hasNext()) {
            arrayList.add(getScoreContextEnum(AbstractC39414r.m125869O0((String) it.next()).toString()));
        }
        return arrayList;
    }
}
