.class final Lkc2/g$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkc2/g;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.settings.referafriend.SettingsReferAFriendInteractor"
    f = "SettingsReferAFriendInteractor.kt"
    l = {
        0x1d
    }
    m = "fetchRafData"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lkc2/g;

.field z:I


# direct methods
.method public constructor <init>(Lkc2/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkc2/g;",
            "Lq83/d<",
            "-",
            "Lkc2/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkc2/g$a;->y:Lkc2/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lkc2/g$a;->x:Ljava/lang/Object;

    iget p1, p0, Lkc2/g$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lkc2/g$a;->z:I

    iget-object p1, p0, Lkc2/g$a;->y:Lkc2/g;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lkc2/g;->c(Lkc2/g;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
