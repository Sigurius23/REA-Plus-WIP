.class public final Lh20/p0;
.super Lh20/t0;
.source "SourceFile"


# static fields
.field public static final a:Lh20/p0;

.field public static final b:Lh20/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh20/p0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh20/p0;->a:Lh20/p0;

    sget-object v0, Lh20/s0;->y:Lh20/s0;

    sput-object v0, Lh20/p0;->b:Lh20/s0;

    return-void
.end method


# virtual methods
.method public final a()Lh20/s0;
    .locals 1

    sget-object v0, Lh20/p0;->b:Lh20/s0;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
