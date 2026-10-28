.class public final Lfa3/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lfa3/z;

.field public static final b:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfa3/z;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfa3/z;->a:Lfa3/z;

    new-instance v0, Lwe/o;

    sget-object v1, Lm83/z;->w:Lm83/z;

    invoke-direct {v0, v1}, Lwe/o;-><init>(Ljava/util/Map;)V

    sput-object v0, Lfa3/z;->b:Lwe/o;

    return-void
.end method
