.class final Lvh2/f$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvh2/f;->d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.strapauth.unlock.StuckLockedCountStore"
    f = "StuckLockedCountStore.kt"
    l = {
        0x1f
    }
    m = "reset"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvh2/f;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvh2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvh2/f;",
            "Lq83/d<",
            "-",
            "Lvh2/f$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvh2/f$d;->E:Lvh2/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lvh2/f$d;->z:Ljava/lang/Object;

    iget p1, p0, Lvh2/f$d;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvh2/f$d;->F:I

    iget-object p1, p0, Lvh2/f$d;->E:Lvh2/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lvh2/f;->d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
