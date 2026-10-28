.class public final synthetic Ls61/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Li91/h;

.field public final synthetic w:Lk61/c;

.field public final synthetic x:Li71/h;

.field public final synthetic y:Li71/g;

.field public final synthetic z:Lu61/a;


# direct methods
.method public synthetic constructor <init>(Lk61/c;Li71/h;Li71/g;Lu61/a;Li91/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls61/b;->w:Lk61/c;

    iput-object p2, p0, Ls61/b;->x:Li71/h;

    iput-object p3, p0, Ls61/b;->y:Li71/g;

    iput-object p4, p0, Ls61/b;->z:Lu61/a;

    iput-object p5, p0, Ls61/b;->E:Li91/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v4, p0, Ls61/b;->E:Li91/h;

    move-object v5, p1

    check-cast v5, Lk2/e;

    iget-object v0, p0, Ls61/b;->w:Lk61/c;

    iget-object v1, p0, Ls61/b;->x:Li71/h;

    iget-object v2, p0, Ls61/b;->y:Li71/g;

    iget-object v3, p0, Ls61/b;->z:Lu61/a;

    invoke-static/range {v0 .. v5}, Ls61/c;->b(Lk61/c;Li71/h;Li71/g;Lu61/a;Li91/h;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
