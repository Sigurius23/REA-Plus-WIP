.class public abstract Ld/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld/x;

.field public static final b:Ld/z;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld/x;

    invoke-direct {v0}, Ld/x;-><init>()V

    const/4 v1, -0x1

    iput v1, v0, Ld/x;->c:I

    sput-object v0, Ld/w0;->a:Ld/x;

    new-instance v0, Ld/z;

    invoke-direct {v0}, Ld/z;-><init>()V

    iput v1, v0, Ld/z;->d:I

    sput-object v0, Ld/w0;->b:Ld/z;

    return-void
.end method
