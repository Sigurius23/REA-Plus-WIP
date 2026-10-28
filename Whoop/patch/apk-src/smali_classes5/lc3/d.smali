.class public final Llc3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lkotlin/jvm/functions/Function3;

.field public final c:Lkotlin/jvm/functions/Function3;

.field public final d:Ljava/lang/Object;

.field public final e:Ls83/i;

.field public final f:Lkotlin/jvm/functions/Function3;

.field public g:Ljava/lang/Object;

.field public h:I

.field public final synthetic i:Llc3/f;


# direct methods
.method public constructor <init>(Llc3/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lhc3/x;Ls83/i;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llc3/d;->i:Llc3/f;

    iput-object p2, p0, Llc3/d;->a:Ljava/lang/Object;

    iput-object p3, p0, Llc3/d;->b:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Llc3/d;->c:Lkotlin/jvm/functions/Function3;

    iput-object p5, p0, Llc3/d;->d:Ljava/lang/Object;

    iput-object p6, p0, Llc3/d;->e:Ls83/i;

    iput-object p7, p0, Llc3/d;->f:Lkotlin/jvm/functions/Function3;

    const/4 p1, -0x1

    iput p1, p0, Llc3/d;->h:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Llc3/d;->g:Ljava/lang/Object;

    instance-of v1, v0, Lhc3/v;

    if-eqz v1, :cond_0

    check-cast v0, Lhc3/v;

    iget v1, p0, Llc3/d;->h:I

    iget-object v2, p0, Llc3/d;->i:Llc3/f;

    iget-object v2, v2, Llc3/f;->w:Lq83/j;

    invoke-virtual {v0, v1, v2}, Lhc3/v;->h(ILq83/j;)V

    return-void

    :cond_0
    instance-of v1, v0, Lbc3/s0;

    if-eqz v1, :cond_1

    check-cast v0, Lbc3/s0;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, Lbc3/s0;->dispose()V

    :cond_2
    return-void
.end method
