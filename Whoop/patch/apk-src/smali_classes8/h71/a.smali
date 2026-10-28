.class public final synthetic Lh71/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh71/a;->w:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh71/a;->w:Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lh71/g;->a(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
