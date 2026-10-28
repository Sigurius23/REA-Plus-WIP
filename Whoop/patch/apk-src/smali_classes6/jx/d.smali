.class public final Ljx/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljx/a;


# instance fields
.field public final a:Le10/k0;

.field public final b:Lg73/d;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg73/d;

    invoke-direct {v0, p0}, Lg73/d;-><init>(Ljx/d;)V

    iput-object v0, p0, Ljx/d;->b:Lg73/d;

    new-instance v0, Le10/k0;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Le10/k0;-><init>(I)V

    new-instance v1, Lex/a;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    const/4 v2, 0x0

    iput-boolean v2, v1, Lex/a;->y:Z

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, v1, Lex/a;->w:Ljava/util/HashSet;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, v1, Lex/a;->x:Ljava/util/HashSet;

    iput-object v1, v0, Le10/k0;->x:Ljava/lang/Object;

    iput-object v0, p0, Ljx/d;->a:Le10/k0;

    return-void
.end method
