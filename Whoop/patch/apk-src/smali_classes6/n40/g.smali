.class public final Ln40/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lec3/w1;

.field public final b:Lec3/q1;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Ln40/g;->a:Lec3/w1;

    invoke-static {v0}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v0

    iput-object v0, p0, Ln40/g;->b:Lec3/q1;

    return-void
.end method
