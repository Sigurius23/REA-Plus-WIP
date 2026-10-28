.class public abstract Lt3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt3/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt3/j;-><init>(Z)V

    sput-object v0, Lt3/i;->a:Lt3/j;

    return-void
.end method

.method public static a(Landroid/graphics/Typeface;)Landroid/text/style/TypefaceSpan;
    .locals 1

    new-instance v0, Landroid/text/style/TypefaceSpan;

    invoke-direct {v0, p0}, Landroid/text/style/TypefaceSpan;-><init>(Landroid/graphics/Typeface;)V

    return-object v0
.end method
