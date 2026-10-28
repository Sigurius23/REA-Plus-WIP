.class public abstract Lk2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly3/d;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1}, Ly3/d;-><init>(FF)V

    sput-object v0, Lk2/d;->a:Ly3/d;

    return-void
.end method
