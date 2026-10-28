.class public final Lg1/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lg1/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg1/k1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg1/k1;->w:Lg1/k1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    sget-wide v0, Li2/x;->b:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    return-object v2
.end method
