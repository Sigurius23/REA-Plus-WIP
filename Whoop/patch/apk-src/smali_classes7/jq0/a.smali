.class public final Ljq0/a;
.super Ljq0/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljq0/c<",
        "Liq0/r;",
        "Ljq0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0008R\u0017\u0010\u0019\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Ljq0/a;",
        "Ljq0/c;",
        "Liq0/r;",
        "Ljq0/b;",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onAttachmentCancelled",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "e",
        "(Landroid/view/ViewGroup;I)Ljq0/b;",
        "b",
        "Lkotlin/jvm/functions/Function1;",
        "getOnAttachmentCancelled",
        "()Lkotlin/jvm/functions/Function1;",
        "f",
        "",
        "c",
        "J",
        "getAttachmentMaxFileSize",
        "()J",
        "attachmentMaxFileSize",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final c:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onAttachmentCancelled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljq0/c;-><init>()V

    .line 2
    iput-object p1, p0, Ljq0/a;->b:Lkotlin/jvm/functions/Function1;

    const-wide/32 v0, 0x1400000

    iput-wide v0, p0, Ljq0/a;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Ljp2/f;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Ljp2/f;-><init>(I)V

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ljq0/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic c(Liq0/r;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljq0/a;->d(Liq0/r;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Liq0/r;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;I)Ljq0/b;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Leq0/g3;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/g3;

    move-result-object p1

    new-instance p2, Ljq0/b;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Ljq0/a;->b:Lkotlin/jvm/functions/Function1;

    iget-wide v1, p0, Ljq0/a;->c:J

    invoke-direct {p2, p1, v0, v1, v2}, Ljq0/b;-><init>(Leq0/g3;Lkotlin/jvm/functions/Function1;J)V

    return-object p2
.end method

.method public final f(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ljq0/a;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljq0/a;->e(Landroid/view/ViewGroup;I)Ljq0/b;

    move-result-object p1

    return-object p1
.end method
