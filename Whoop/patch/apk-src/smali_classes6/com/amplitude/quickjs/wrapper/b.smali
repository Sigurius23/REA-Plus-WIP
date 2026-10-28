.class public final synthetic Lcom/amplitude/quickjs/wrapper/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amplitude/quickjs/wrapper/JSCallFunction;


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Method;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amplitude/quickjs/wrapper/b;->a:Ljava/lang/reflect/Method;

    iput-object p2, p0, Lcom/amplitude/quickjs/wrapper/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/b;->a:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lcom/amplitude/quickjs/wrapper/b;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
