.class public final Lu1/s;
.super Lu1/p;
.source "SourceFile"


# instance fields
.field public final z:Lm83/t;


# direct methods
.method public constructor <init>(Lm83/t;)V
    .locals 0

    invoke-direct {p0}, Lu1/p;-><init>()V

    iput-object p1, p0, Lu1/s;->z:Lm83/t;

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lu1/p;->y:I

    add-int/lit8 v1, v0, 0x2

    iput v1, p0, Lu1/p;->y:I

    new-instance v1, Lu1/b;

    iget-object v2, p0, Lu1/p;->w:[Ljava/lang/Object;

    aget-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v2, v0

    iget-object v2, p0, Lu1/s;->z:Lm83/t;

    invoke-direct {v1, v2, v3, v0}, Lu1/b;-><init>(Lm83/t;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
