.class public final Lu8/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu8/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu8/v;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu8/v;->a:Lu8/v;

    const/4 v0, 0x0

    invoke-static {v0}, Lx8/t;->F(I)V

    const/4 v0, 0x1

    invoke-static {v0}, Lx8/t;->F(I)V

    const/4 v0, 0x2

    invoke-static {v0}, Lx8/t;->F(I)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lu8/v;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
