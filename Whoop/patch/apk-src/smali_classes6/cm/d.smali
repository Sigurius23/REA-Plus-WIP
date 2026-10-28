.class public abstract Lcm/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:Lcm/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const v0, 0x3e99999a    # 0.3f

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-static {v2, v2, v2, v0, v1}, Li2/w0;->f(FFFFI)J

    move-result-wide v0

    sput-wide v0, Lcm/d;->a:J

    sget-object v0, Lcm/c;->w:Lcm/c;

    sput-object v0, Lcm/d;->b:Lcm/c;

    return-void
.end method
