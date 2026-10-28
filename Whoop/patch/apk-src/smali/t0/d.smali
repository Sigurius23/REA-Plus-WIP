.class public abstract Lt0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt0/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lt0/d;->a:Lt0/c;

    return-void
.end method

.method public static final a(I)Lt0/g;
    .locals 1

    new-instance v0, Lt0/g;

    int-to-float p0, p0

    invoke-direct {v0, p0}, Lt0/g;-><init>(F)V

    return-object v0
.end method
