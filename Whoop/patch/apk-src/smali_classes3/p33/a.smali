.class public abstract Lp33/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li93/j;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li93/j;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, -0x32

    invoke-direct {v0, v3, v1, v2}, Li93/h;-><init>(III)V

    sput-object v0, Lp33/a;->a:Li93/j;

    iget v0, v0, Li93/h;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sub-int/2addr v0, v1

    sput v0, Lp33/a;->b:I

    return-void
.end method
