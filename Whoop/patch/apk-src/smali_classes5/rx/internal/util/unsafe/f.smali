.class public abstract Lrx/internal/util/unsafe/f;
.super Lrx/internal/util/unsafe/a;
.source "SourceFile"


# static fields
.field public static final F:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "jctools.spsc.max.lookahead.step"

    const/16 v1, 0x1000

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lrx/internal/util/unsafe/f;->F:Ljava/lang/Integer;

    return-void
.end method
