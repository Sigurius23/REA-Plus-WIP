.class public final synthetic Lcz0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Ldz0/c;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lu2/v;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ldz0/c;Ljava/util/List;Lu2/v;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz0/e;->w:Ldz0/c;

    iput-object p2, p0, Lcz0/e;->x:Ljava/util/List;

    iput-object p3, p0, Lcz0/e;->y:Lu2/v;

    iput-boolean p4, p0, Lcz0/e;->z:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p1

    check-cast v4, Lu2/r;

    move-object v5, p2

    check-cast v5, Lh2/b;

    iget-object v0, p0, Lcz0/e;->w:Ldz0/c;

    iget-object v1, p0, Lcz0/e;->x:Ljava/util/List;

    iget-object v2, p0, Lcz0/e;->y:Lu2/v;

    iget-boolean v3, p0, Lcz0/e;->z:Z

    invoke-static/range {v0 .. v5}, Lcz0/f$a;->c(Ldz0/c;Ljava/util/List;Lu2/v;ZLu2/r;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
