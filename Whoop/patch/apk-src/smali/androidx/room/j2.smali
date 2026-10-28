.class public final Landroidx/room/j2;
.super Landroidx/room/s;
.source "SourceFile"


# instance fields
.field public final b:Landroidx/room/v;

.field public final c:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroidx/room/v;Landroidx/room/p1;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Landroidx/room/s;->a:[Ljava/lang/String;

    invoke-direct {p0, v0}, Landroidx/room/s;-><init>([Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/room/j2;->b:Landroidx/room/v;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/room/j2;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)V
    .locals 1

    const-string v0, "tables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/j2;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/room/s;

    if-nez v0, :cond_0

    iget-object p1, p0, Landroidx/room/j2;->b:Landroidx/room/v;

    invoke-virtual {p1, p0}, Landroidx/room/v;->c(Landroidx/room/s;)V

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/room/s;->a(Ljava/util/Set;)V

    return-void
.end method
