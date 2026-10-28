.class public final Lq30/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq30/h0;->a:Ljava/lang/String;

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    const-string v0, "application/json"

    invoke-static {p2, v0, p1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    move p1, v0

    :cond_0
    iput-boolean p1, p0, Lq30/h0;->b:Z

    return-void
.end method
