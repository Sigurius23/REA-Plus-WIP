.class public final Lu0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lu0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu0/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu0/f;->w:Lu0/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    const v0, 0x4dffeb3b    # 5.3670077E8f

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    return-object v2
.end method
