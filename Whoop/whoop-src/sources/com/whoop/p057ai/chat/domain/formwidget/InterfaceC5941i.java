package com.whoop.p057ai.chat.domain.formwidget;

import c91.AbstractC4328b;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/i;", "", "a", "b", "Lcom/whoop/ai/chat/domain/formwidget/i$a;", "Lcom/whoop/ai/chat/domain/formwidget/i$b;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC5941i {

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.i$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/i$a;", "Lcom/whoop/ai/chat/domain/formwidget/i;", "", "turnId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC5941i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String turnId;

        public a(String turnId) {
            AbstractC22676k.m65750j(turnId, "turnId");
            this.turnId = turnId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.turnId, ((a) other).turnId);
        }

        public int hashCode() {
            return this.turnId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("GetConversationTurn(turnId=", this.turnId, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.i$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/i$b;", "Lcom/whoop/ai/chat/domain/formwidget/i;", "Lc91/b;", "error", "<init>", "(Lc91/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc91/b;", "()Lc91/b;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC5941i {

        /* JADX INFO: renamed from: b */
        public static final int f23430b = AbstractC4328b.f17583a;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC4328b error;

        public b(AbstractC4328b error) {
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC4328b getError() {
            return this.error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.error, ((b) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "SubmitFailed(error=" + this.error + ")";
        }
    }
}
