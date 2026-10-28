.class public final Lx30/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lux/a;

.field public final c:Lux/b;

.field public final d:Lzy/b;

.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(ZLux/a;Lux/b;)V
    .locals 1

    const-string v0, "cardBrandFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardFundingFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lx30/y;->a:Z

    iput-object p2, p0, Lx30/y;->b:Lux/a;

    iput-object p3, p0, Lx30/y;->c:Lux/b;

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    sget-object p2, Lm83/y;->w:Lm83/y;

    const p3, 0x7f140f5f

    invoke-static {p3, p1, p2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    iput-object p1, p0, Lx30/y;->d:Lzy/b;

    const/16 p1, 0x8

    iput p1, p0, Lx30/y;->e:I

    const/16 p1, 0x9

    iput p1, p0, Lx30/y;->f:I

    const/4 p1, 0x6

    iput p1, p0, Lx30/y;->g:I

    return-void
.end method
