.class public abstract Lch3/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lch3/d0;

.field public static final b:Lch3/h0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lch3/d0;

    invoke-direct {v0}, Lch3/d0;-><init>()V

    sput-object v0, Lch3/c0;->a:Lch3/d0;

    new-instance v0, Lch3/h0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lch3/h0;-><init>(Z)V

    sput-object v0, Lch3/c0;->b:Lch3/h0;

    return-void
.end method
