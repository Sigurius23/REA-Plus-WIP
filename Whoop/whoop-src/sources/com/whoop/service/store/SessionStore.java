package com.whoop.service.store;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.whoop.domain.model.Session;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m83.C25271y;
import or2.C28169i0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import u92.C34660d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/service/store/SessionStore;", "", "Lcom/google/gson/Gson;", "gson", "Lu92/d;", "prefs", "<init>", "(Lcom/google/gson/Gson;Lu92/d;)V", "", "Lcom/whoop/domain/model/Session;", "b", "()Ljava/util/Collection;", "a", "()Lcom/whoop/domain/model/Session;", "sessions", "Ll83/a0;", "d", "(Ljava/util/Collection;)V", "lastActiveSession", "c", "(Lcom/whoop/domain/model/Session;)V", "Lcom/google/gson/Gson;", "Lu92/d;", "Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "sessionsType", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SessionStore {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Gson gson;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34660d prefs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Type sessionsType;

    public SessionStore(Gson gson, C34660d prefs) {
        AbstractC22676k.m65750j(gson, "gson");
        AbstractC22676k.m65750j(prefs, "prefs");
        this.gson = gson;
        this.prefs = prefs;
        Type type = new TypeToken<ArrayList<Session>>() { // from class: com.whoop.service.store.SessionStore$sessionsType$1
        }.getType();
        AbstractC22676k.m65749i(type, "getType(...)");
        this.sessionsType = type;
    }

    /* JADX INFO: renamed from: a */
    public final Session m24777a() {
        String strM109534k = this.prefs.m109534k("lastActiveSession", null);
        if (strM109534k != null) {
            return (Session) this.gson.fromJson(strM109534k, Session.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Collection<Session> m24778b() {
        Collection<Session> collection;
        String strM109534k = this.prefs.m109534k("sessions", null);
        if (strM109534k != null) {
            Object objFromJson = this.gson.fromJson(strM109534k, this.sessionsType);
            AbstractC22676k.m65747g(objFromJson);
            collection = (List) objFromJson;
        } else {
            collection = C25271y.f99162w;
        }
        return collection;
    }

    /* JADX INFO: renamed from: c */
    public final void m24779c(Session lastActiveSession) {
        AbstractC22676k.m65750j(lastActiveSession, "lastActiveSession");
        this.prefs.m109543v("lastActiveSession", this.gson.toJson(lastActiveSession));
    }

    /* JADX INFO: renamed from: d */
    public final void m24780d(Collection<Session> sessions) {
        AbstractC22676k.m65750j(sessions, "sessions");
        this.prefs.m109543v("sessions", this.gson.toJson(new ArrayList(sessions), this.sessionsType));
    }

    public /* synthetic */ SessionStore(Gson gson, C34660d c34660d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C28169i0.m85274d() : gson, c34660d);
    }
}
