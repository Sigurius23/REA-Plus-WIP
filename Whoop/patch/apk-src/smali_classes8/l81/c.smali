.class public final synthetic Ll81/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ly2/j1;

.field public final synthetic x:Ly2/j1;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Ly2/j1;Ly2/j1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll81/c;->w:Ly2/j1;

    iput-object p2, p0, Ll81/c;->x:Ly2/j1;

    iput p3, p0, Ll81/c;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ll81/c;->y:I

    check-cast p1, Ly2/i1;

    iget-object v1, p0, Ll81/c;->w:Ly2/j1;

    iget-object v2, p0, Ll81/c;->x:Ly2/j1;

    invoke-static {v1, v2, v0, p1}, Ll81/d$a;->f(Ly2/j1;Ly2/j1;ILy2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
