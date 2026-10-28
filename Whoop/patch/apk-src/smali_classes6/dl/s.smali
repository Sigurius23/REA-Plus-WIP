.class public final Ldl/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwk/e;

.field public final b:Ljava/util/List;

.field public final c:Lxk/e;


# direct methods
.method public constructor <init>(Lwk/e;Lxk/e;)V
    .locals 2

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "Argument must not be null"

    invoke-static {p1, v1}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ldl/s;->a:Lwk/e;

    invoke-static {v0, v1}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Ldl/s;->b:Ljava/util/List;

    invoke-static {p2, v1}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ldl/s;->c:Lxk/e;

    return-void
.end method
