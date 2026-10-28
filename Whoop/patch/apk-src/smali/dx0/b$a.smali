.class final Ldx0/b$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldx0/b;->l(Lic/n0;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.DataSyncServiceManager"
    f = "DataSyncServiceManager.kt"
    l = {
        0xc0,
        0xc5,
        0xc6
    }
    m = "handleIntervalType"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Ldx0/b;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Ldx0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldx0/b;",
            "Lq83/d<",
            "-",
            "Ldx0/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldx0/b$a;->F:Ldx0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldx0/b$a;->E:Ljava/lang/Object;

    iget p1, p0, Ldx0/b$a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldx0/b$a;->G:I

    iget-object p1, p0, Ldx0/b$a;->F:Ldx0/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ldx0/b;->f(Ldx0/b;Lic/n0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
