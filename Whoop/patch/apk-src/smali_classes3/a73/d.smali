.class public abstract La73/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz63/c;

.field public static final b:Lz63/c;

.field public static final c:Lz63/c;

.field public static final d:Lz63/c;

.field public static final e:Lz63/c;

.field public static final f:Lz63/c;

.field public static final g:Lz63/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz63/c;

    const-string v1, "list-item-type"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, La73/d;->a:Lz63/c;

    new-instance v0, Lz63/c;

    const-string v1, "bullet-list-item-level"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, La73/d;->b:Lz63/c;

    new-instance v0, Lz63/c;

    const-string v1, "ordered-list-item-number"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, La73/d;->c:Lz63/c;

    new-instance v0, Lz63/c;

    const-string v1, "heading-level"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, La73/d;->d:Lz63/c;

    new-instance v0, Lz63/c;

    const-string v1, "link-destination"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, La73/d;->e:Lz63/c;

    new-instance v0, Lz63/c;

    const-string v1, "paragraph-is-in-tight-list"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, La73/d;->f:Lz63/c;

    new-instance v0, Lz63/c;

    const-string v1, "code-block-info"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, La73/d;->g:Lz63/c;

    return-void
.end method
