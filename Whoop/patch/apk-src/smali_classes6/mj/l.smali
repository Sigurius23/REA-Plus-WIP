.class public final Lmj/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhj/a;


# instance fields
.field public final synthetic a:Lmj/p;


# direct methods
.method public constructor <init>(Lmj/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmj/l;->a:Lmj/p;

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lmj/l;->a:Lmj/p;

    invoke-virtual {v0}, Lmj/p;->d()V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lmj/p;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Lmj/p;->c()V

    return-void
.end method
