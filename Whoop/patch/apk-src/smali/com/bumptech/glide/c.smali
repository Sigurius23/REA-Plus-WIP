.class public final Lcom/bumptech/glide/c;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# static fields
.field public static final j:Lcom/bumptech/glide/a;


# instance fields
.field public final a:Lal/g;

.field public final b:La3/l1;

.field public final c:Ljc/b;

.field public final d:Lio/sentry/hints/j;

.field public final e:Ljava/util/List;

.field public final f:La0/g;

.field public final g:Lzk/l;

.field public final h:I

.field public i:Lpl/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/bumptech/glide/a;

    invoke-direct {v0}, Lcom/bumptech/glide/i;-><init>()V

    sput-object v0, Lcom/bumptech/glide/c;->j:Lcom/bumptech/glide/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lal/g;La3/l1;Ljc/b;Lio/sentry/hints/j;La0/g;Ljava/util/List;Lzk/l;)V
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/bumptech/glide/c;->a:Lal/g;

    iput-object p3, p0, Lcom/bumptech/glide/c;->b:La3/l1;

    iput-object p4, p0, Lcom/bumptech/glide/c;->c:Ljc/b;

    iput-object p5, p0, Lcom/bumptech/glide/c;->d:Lio/sentry/hints/j;

    iput-object p7, p0, Lcom/bumptech/glide/c;->e:Ljava/util/List;

    iput-object p6, p0, Lcom/bumptech/glide/c;->f:La0/g;

    iput-object p8, p0, Lcom/bumptech/glide/c;->g:Lzk/l;

    const/4 p1, 0x4

    iput p1, p0, Lcom/bumptech/glide/c;->h:I

    return-void
.end method
