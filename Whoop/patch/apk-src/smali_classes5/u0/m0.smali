.class public abstract Lu0/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lty/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Lu0/l0;->w:I

    new-instance v0, Lu0/y0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lu0/y0;-><init>(I)V

    new-instance v2, Lty/c;

    invoke-direct {v2, v0, v1}, Lty/c;-><init>(Ljava/lang/Object;I)V

    sput-object v2, Lu0/m0;->a:Lty/c;

    return-void
.end method
