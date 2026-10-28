.class public final synthetic Lce3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lce3/q;

.field public final synthetic x:I

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(Lce3/q;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce3/i;->w:Lce3/q;

    iput p2, p0, Lce3/i;->x:I

    iput-wide p3, p0, Lce3/i;->y:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lce3/i;->w:Lce3/q;

    iget v1, p0, Lce3/i;->x:I

    iget-wide v2, p0, Lce3/i;->y:J

    :try_start_0
    iget-object v4, v0, Lce3/q;->X:Lce3/z;

    invoke-virtual {v4, v1, v2, v3}, Lce3/z;->J(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v2, Lce3/a;->z:Lce3/a;

    invoke-virtual {v0, v2, v2, v1}, Lce3/q;->b(Lce3/a;Lce3/a;Ljava/io/IOException;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
