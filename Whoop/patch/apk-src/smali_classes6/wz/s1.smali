.class public final Lwz/s1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lec3/w1;

.field public final b:Lec3/w1;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-static {v0, v1, v2, v3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v4

    iput-object v4, p0, Lwz/s1;->a:Lec3/w1;

    invoke-static {v0, v1, v2, v3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lwz/s1;->b:Lec3/w1;

    return-void
.end method
