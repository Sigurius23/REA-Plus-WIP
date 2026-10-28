.class public abstract Lre/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lre/g0;

    sget-object v1, Lre/d0;->b:Lre/d0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lre/f0;->b:Lre/f0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method
