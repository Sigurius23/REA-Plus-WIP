.class final Lba0/c$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba0/c;->i(Lba0/b;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.add.activity.domain.AddActivityInteractor"
    f = "AddActivityInteractor.kt"
    l = {
        0xbf
    }
    m = "goBack"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lba0/c;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method public constructor <init>(Lba0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lba0/c;",
            "Lq83/d<",
            "-",
            "Lba0/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lba0/c$f;->G:Lba0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lba0/c$f;->F:Ljava/lang/Object;

    iget p1, p0, Lba0/c$f;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lba0/c$f;->H:I

    iget-object p1, p0, Lba0/c$f;->G:Lba0/c;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lba0/c;->d(Lba0/c;Lba0/b;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
