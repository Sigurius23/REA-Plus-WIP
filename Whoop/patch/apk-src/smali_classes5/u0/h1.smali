.class public final Lu0/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu0/s0;

.field public final b:Lf1/s1;

.field public final c:Lq3/y;

.field public final d:Z

.field public final e:Z

.field public final f:Lf1/x1;

.field public final g:Lq3/r;

.field public final h:Lu0/t1;

.field public final i:Lu0/d0;

.field public final j:Lu0/y0;

.field public final k:Lkotlin/jvm/functions/Function1;

.field public final l:I


# direct methods
.method public constructor <init>(Lu0/s0;Lf1/s1;Lq3/y;ZZLf1/x1;Lq3/r;Lu0/t1;Lu0/d0;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    sget-object v0, Lu0/n0;->a:Lu0/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/h1;->a:Lu0/s0;

    iput-object p2, p0, Lu0/h1;->b:Lf1/s1;

    iput-object p3, p0, Lu0/h1;->c:Lq3/y;

    iput-boolean p4, p0, Lu0/h1;->d:Z

    iput-boolean p5, p0, Lu0/h1;->e:Z

    iput-object p6, p0, Lu0/h1;->f:Lf1/x1;

    iput-object p7, p0, Lu0/h1;->g:Lq3/r;

    iput-object p8, p0, Lu0/h1;->h:Lu0/t1;

    iput-object p9, p0, Lu0/h1;->i:Lu0/d0;

    iput-object v0, p0, Lu0/h1;->j:Lu0/y0;

    iput-object p10, p0, Lu0/h1;->k:Lkotlin/jvm/functions/Function1;

    iput p11, p0, Lu0/h1;->l:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, Lu0/h1;->a:Lu0/s0;

    iget-object v0, v0, Lu0/s0;->d:Lq3/i;

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    new-instance v1, Lq3/j;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Lq3/i;->b(Ljava/util/List;)Lq3/y;

    move-result-object p1

    iget-object v0, p0, Lu0/h1;->k:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
