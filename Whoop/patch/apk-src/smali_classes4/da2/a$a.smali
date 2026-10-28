.class final Lda2/a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda2/a;->a(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.timezone.TimezoneUpdateDataStoreHelper"
    f = "TimezoneUpdateDataStoreHelper.kt"
    l = {
        0x33
    }
    m = "clearTimezoneUpdateTimestamp"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lda2/a;

.field y:I


# direct methods
.method public constructor <init>(Lda2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda2/a;",
            "Lq83/d<",
            "-",
            "Lda2/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lda2/a$a;->x:Lda2/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lda2/a$a;->w:Ljava/lang/Object;

    iget p1, p0, Lda2/a$a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lda2/a$a;->y:I

    iget-object p1, p0, Lda2/a$a;->x:Lda2/a;

    invoke-virtual {p1, p0}, Lda2/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
