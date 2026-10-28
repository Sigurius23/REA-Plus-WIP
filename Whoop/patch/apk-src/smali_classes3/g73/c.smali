.class public abstract Lg73/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz63/c;

.field public static final b:Lz63/c;

.field public static final c:Lz63/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz63/c;

    const-string v1, "image-destination"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg73/c;->a:Lz63/c;

    new-instance v0, Lz63/c;

    const-string v1, "image-replacement-text-is-link"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg73/c;->b:Lz63/c;

    new-instance v0, Lz63/c;

    const-string v1, "image-size"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg73/c;->c:Lz63/c;

    return-void
.end method
