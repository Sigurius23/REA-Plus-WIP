.class public final synthetic Lnw0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Z

.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ll83/k;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll83/k;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnw0/c;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lnw0/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lnw0/c;->y:Ll83/k;

    iput-object p4, p0, Lnw0/c;->z:Ljava/lang/String;

    iput-boolean p5, p0, Lnw0/c;->E:Z

    iput-object p6, p0, Lnw0/c;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lnw0/c;->G:Lkotlin/jvm/functions/Function1;

    iput-boolean p8, p0, Lnw0/c;->H:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v8, p1

    check-cast v8, Ll0/y;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lnw0/c;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnw0/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lnw0/c;->y:Ll83/k;

    iget-object v3, p0, Lnw0/c;->z:Ljava/lang/String;

    iget-boolean v4, p0, Lnw0/c;->E:Z

    iget-object v5, p0, Lnw0/c;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lnw0/c;->G:Lkotlin/jvm/functions/Function1;

    iget-boolean v7, p0, Lnw0/c;->H:Z

    invoke-static/range {v0 .. v10}, Lnw0/g;->i(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll83/k;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLl0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
