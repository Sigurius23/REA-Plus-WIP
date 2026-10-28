.class public final Lz0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/g;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lc93/a;

.field public final d:Lf0/c1;

.field public final e:Lz1/v;

.field public final f:Lz0/a;

.field public final g:Lz0/a;

.field public h:Landroid/view/ActionMode;

.field public i:Landroidx/fragment/app/d;


# direct methods
.method public constructor <init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/f;->a:Landroid/view/View;

    iput-object p2, p0, Lz0/f;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lz0/f;->c:Lc93/a;

    new-instance p1, Lf0/c1;

    invoke-direct {p1}, Lf0/c1;-><init>()V

    iput-object p1, p0, Lz0/f;->d:Lf0/c1;

    new-instance p1, Lz1/v;

    new-instance p2, Lz0/a;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lz0/a;-><init>(Lz0/f;I)V

    invoke-direct {p1, p2}, Lz1/v;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lz0/f;->e:Lz1/v;

    new-instance p1, Lz0/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lz0/a;-><init>(Lz0/f;I)V

    iput-object p1, p0, Lz0/f;->f:Lz0/a;

    new-instance p1, Lz0/a;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lz0/a;-><init>(Lz0/f;I)V

    iput-object p1, p0, Lz0/f;->g:Lz0/a;

    return-void
.end method


# virtual methods
.method public final a(Lb1/f;Ls83/i;)Ljava/lang/Object;
    .locals 3

    new-instance v0, La33/c;

    const/4 v1, 0x0

    const/16 v2, 0xf

    invoke-direct {v0, p0, p1, v1, v2}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iget-object p1, p0, Lz0/f;->d:Lf0/c1;

    invoke-static {p1, v0, p2}, Lf0/c1;->b(Lf0/c1;Lkotlin/jvm/functions/Function1;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
