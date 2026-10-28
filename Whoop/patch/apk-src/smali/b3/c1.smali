.class public final Lb3/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic w:Lbc3/m;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lbc3/m;Lb3/d1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/c1;->w:Lbc3/m;

    iput-object p3, p0, Lb3/c1;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 1

    iget-object v0, p0, Lb3/c1;->x:Lkotlin/jvm/functions/Function1;

    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_0
    iget-object p2, p0, Lb3/c1;->w:Lbc3/m;

    invoke-virtual {p2, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
