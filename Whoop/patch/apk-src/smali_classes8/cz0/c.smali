.class public final synthetic Lcz0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ldz0/c;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lu2/v;


# direct methods
.method public synthetic constructor <init>(Ldz0/c;Ljava/util/List;Lu2/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz0/c;->w:Ldz0/c;

    iput-object p2, p0, Lcz0/c;->x:Ljava/util/List;

    iput-object p3, p0, Lcz0/c;->y:Lu2/v;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcz0/c;->y:Lu2/v;

    check-cast p1, Lh2/b;

    iget-object v1, p0, Lcz0/c;->w:Ldz0/c;

    iget-object v2, p0, Lcz0/c;->x:Ljava/util/List;

    invoke-static {v1, v2, v0, p1}, Lcz0/f$a;->b(Ldz0/c;Ljava/util/List;Lu2/v;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
