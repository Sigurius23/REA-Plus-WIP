.class public final Lwe/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lwe/i0;

.field public static final b:Lwe/e0;

.field public static final c:Lwe/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwe/i0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lwe/i0;->a:Lwe/i0;

    new-instance v0, Lwe/e0;

    invoke-direct {v0}, Lwe/e0;-><init>()V

    sput-object v0, Lwe/i0;->b:Lwe/e0;

    new-instance v0, Lwe/g0;

    invoke-direct {v0}, Lwe/g0;-><init>()V

    sput-object v0, Lwe/i0;->c:Lwe/g0;

    return-void
.end method

.method public static a()Lwe/e0;
    .locals 1

    sget-object v0, Lwe/i0;->b:Lwe/e0;

    return-object v0
.end method

.method public static b()Lwe/g0;
    .locals 1

    sget-object v0, Lwe/i0;->c:Lwe/g0;

    return-object v0
.end method
