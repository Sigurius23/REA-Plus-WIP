.class public final Lwe/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lwe/k;

.field public static final b:Laj/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwe/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lwe/k;->a:Lwe/k;

    new-instance v0, Laj/c;

    const/16 v1, 0x1b

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laj/c;-><init>(IB)V

    sput-object v0, Lwe/k;->b:Laj/c;

    return-void
.end method
