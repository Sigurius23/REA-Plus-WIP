.class public final Lcom/stripe/android/financialconnections/model/o;
.super Lxy/a;
.source "SourceFile"


# static fields
.field public static final e:Lcom/stripe/android/financialconnections/model/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/model/o;

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->getEntries()Lt83/a;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Enum;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-direct {v0, v1, v2}, Lxy/a;-><init>([Ljava/lang/Enum;Ljava/lang/Enum;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/o;->e:Lcom/stripe/android/financialconnections/model/o;

    return-void
.end method
