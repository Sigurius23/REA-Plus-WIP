.class public final Ltt/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltt/h;


# instance fields
.field public final a:Ltt/i;

.field public final b:Lcq/i;


# direct methods
.method public constructor <init>(Ltt/i;Lcq/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltt/e;->a:Ltt/i;

    iput-object p2, p0, Ltt/e;->b:Lcq/i;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Ltt/e;->b:Lcq/i;

    invoke-virtual {v0, p1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final b(Lut/a;)Z
    .locals 7

    iget v0, p1, Lut/a;->b:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ltt/e;->a:Ltt/i;

    invoke-virtual {v0, p1}, Ltt/i;->a(Lut/a;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v2, p1, Lut/a;->c:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-wide v3, p1, Lut/a;->e:J

    iget-wide v5, p1, Lut/a;->f:J

    new-instance v1, Ltt/a;

    invoke-direct/range {v1 .. v6}, Ltt/a;-><init>(Ljava/lang/String;JJ)V

    iget-object p1, p0, Ltt/e;->b:Lcq/i;

    invoke-virtual {p1, v1}, Lcq/i;->b(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null token"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
