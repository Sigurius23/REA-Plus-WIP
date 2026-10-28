.class public final Ll1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Ll1/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll1/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll1/r;->w:Ll1/r;

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
